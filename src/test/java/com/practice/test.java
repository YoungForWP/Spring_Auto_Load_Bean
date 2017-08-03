package com.practice;

import com.two.practice.Poem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class test {

    @Autowired
    private Novel novel;
    @Autowired
    private Poem poem;

    @Test
    public void ShouldLoadBean() throws Exception {
        assertNotNull(novel);
        assertNotNull(poem);
    }
}
