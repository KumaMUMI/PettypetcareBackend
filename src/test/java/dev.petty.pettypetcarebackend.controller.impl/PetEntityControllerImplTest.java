package dev.petty.pettypetcarebackend.controller.impl;

import dev.petty.pettypetcarebackend.controller.impl.CustomUtils;
import dev.petty.pettypetcarebackend.dto.PetDTO;
import dev.petty.pettypetcarebackend.entity.PetEntity;
import dev.petty.pettypetcarebackend.mapper.PetMapper;
import dev.petty.pettypetcarebackend.mapper.ReferenceMapper;
import dev.petty.pettypetcarebackend.service.PetService;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class PetEntityControllerImplTest {
    //TODO: create the data Test generator class PetBuilder
    private static final String ENDPOINT_URL = "/pets";
    @MockBean
    private ReferenceMapper referenceMapper;
    @InjectMocks
    private PetEntityControllerImpl petController;
    @MockBean
    private PetService petService;
    @MockBean
    private PetMapper petMapper;
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.petController).build();
    }

    @Test
    public void getAll() throws Exception {
        Mockito.when(petMapper.asDTOList(ArgumentMatchers.any())).thenReturn(PetBuilder.getListDTO());

        Mockito.when(petService.findAll()).thenReturn(PetBuilder.getListEntities());
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));

    }

    @Test
    public void getById() throws Exception {
        Mockito.when(petMapper.asDTO(ArgumentMatchers.any())).thenReturn(PetBuilder.getDTO());

        Mockito.when(petService.findById(ArgumentMatchers.anyLong())).thenReturn(java.util.Optional.of(PetBuilder.getEntity()));

        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
        Mockito.verify(petService, Mockito.times(1)).findById(1L);
        Mockito.verifyNoMoreInteractions(petService);
    }

    @Test
    public void save() throws Exception {
        Mockito.when(petMapper.asEntity(ArgumentMatchers.any())).thenReturn(PetBuilder.getEntity());
        Mockito.when(petService.save(ArgumentMatchers.any(Pet.class))).thenReturn(PetBuilder.getEntity());

        mockMvc.perform(
                        MockMvcRequestBuilders.post(ENDPOINT_URL)
                                .contentType(MediaType.APPLICATION_JSON_UTF8)
                                .content(CustomUtils.asJsonString(PetBuilder.getDTO())))
                .andExpect(MockMvcResultMatchers.status().isCreated());
        Mockito.verify(petService, Mockito.times(1)).save(ArgumentMatchers.any(Pet.class));
        Mockito.verifyNoMoreInteractions(petService);
    }

    @Test
    public void update() throws Exception {
        Mockito.when(petMapper.asEntity(ArgumentMatchers.any())).thenReturn(PetBuilder.getEntity());
        Mockito.when(petService.update(ArgumentMatchers.any(), ArgumentMatchers.anyLong())).thenReturn(PetBuilder.getEntity());

        mockMvc.perform(
                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON_UTF8)
                                .content(CustomUtils.asJsonString(PetBuilder.getDTO())))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(petService, Mockito.times(1)).update(ArgumentMatchers.any(Pet.class), ArgumentMatchers.anyLong());
        Mockito.verifyNoMoreInteractions(petService);
    }

    @Test
    public void delete() throws Exception {
        Mockito.doNothing().when(petService).deleteById(ArgumentMatchers.anyLong());
        mockMvc.perform(
                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(petService, Mockito.times(1)).deleteById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(petService);
    }