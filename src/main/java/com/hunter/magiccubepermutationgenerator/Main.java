package com.hunter.magiccubepermutationgenerator;

import com.hunter.magic_cube.permutation_generator.PocketCubePermutationGenerator;

public class Main {
    public static void main(String[] args){
        PocketCubePermutationGenerator generator = new PocketCubePermutationGenerator();
        generator.executeWithBFS();
    }
}
