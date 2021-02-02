/*
 * Copyright 2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.java.tree;

import org.openrewrite.internal.lang.Nullable;

import java.util.List;

public abstract class Coordinates <J2 extends J> {

    protected J2 tree;

    protected Coordinates(J2 tree) {
        this.tree = tree;
    }

    protected JavaCoordinates create(@Nullable Space.Location location) {
        return new JavaCoordinates(tree, location);
    }

    public JavaCoordinates around() {
        return create(null);
    }

    public abstract JavaCoordinates before();

    public static class AnnotatedTypeCoordinates extends Coordinates {

        protected AnnotatedTypeCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class AnnotationCoordinates extends Coordinates {

        protected AnnotationCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ArrayAccessCoordinates extends Coordinates {

        protected ArrayAccessCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ArrayDimensionCoordinates extends Coordinates {

        protected ArrayDimensionCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ArrayTypeCoordinates extends Coordinates {

        protected ArrayTypeCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class AssertCoordinates extends Coordinates {

        protected AssertCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class AssignCoordinates extends Coordinates {

        protected AssignCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class AssignOpCoordinates extends Coordinates {

        protected AssignOpCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class BinaryCoordinates extends Coordinates {

        protected BinaryCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class BlockCoordinates extends Coordinates {

        protected BlockCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class BreakCoordinates extends Coordinates {

        protected BreakCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class CaseCoordinates extends Coordinates {

        protected CaseCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ClassDeclCoordinates extends Coordinates {

        protected ClassDeclCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { return create(Space.Location.CLASS_DECL_PREFIX); }
        public JavaCoordinates extending() {return create(Space.Location.EXTENDS); }

        //TODO MOAR!
    }
    public static class CompilationUnitCoordinates extends Coordinates {

        protected CompilationUnitCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ContinueCoordinates extends Coordinates {

        protected ContinueCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ControlParenthesesCoordinates extends Coordinates {

        protected ControlParenthesesCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class DoWhileLoopCoordinates extends Coordinates {

        protected DoWhileLoopCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class EmptyCoordinates extends Coordinates {

        protected EmptyCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class EnumValueCoordinates extends Coordinates {

        protected EnumValueCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class EnumValueSetCoordinates extends Coordinates {

        protected EnumValueSetCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class FieldAccessCoordinates extends Coordinates {

        protected FieldAccessCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ForEachLoopCoordinates extends Coordinates {

        protected ForEachLoopCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ForLoopCoordinates extends Coordinates {

        protected ForLoopCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class IdentCoordinates extends Coordinates {

        protected IdentCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class IfCoordinates extends Coordinates {

        protected IfCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }
    public static class ImportCoordinates extends Coordinates {

        protected ImportCoordinates(J.ClassDecl tree) {super(tree); }

        @Override
        public JavaCoordinates before() { throw new UnsupportedOperationException("Not Implemented"); }

        //TODO MOAR!
    }

// --------------------------------
// --------------------------------
// --------------------------------
// --------------------------------
// --------------------------------
// --------------------------------

    public static class InstanceOf extends Coordinates<J.InstanceOf> {

        protected InstanceOf(J.InstanceOf tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.INSTANCEOF_PREFIX);
        }
    }

    public static class Label extends Coordinates<J.Label> {

        protected Label(J.Label tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.LABEL_PREFIX);
        }
    }

    public static class Lambda extends Coordinates<J.Lambda> {

        protected Lambda(J.Lambda tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.LAMBDA_PREFIX);
        }

        public static class Parameters extends Coordinates<J.Lambda.Parameters> {

            protected Parameters(J.Lambda.Parameters tree) {
                super(tree);
            }

            @Override
            public JavaCoordinates before() {
                return create(Space.Location.LAMBDA_PARAMETERS_PREFIX);
            }
        }
    }

    public static class Literal extends Coordinates<J.Literal> {

        protected Literal(J.Literal tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.LITERAL_PREFIX);
        }
    }

    public static class MemberReference extends Coordinates<J.MemberReference> {

        protected MemberReference(J.MemberReference tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.MEMBER_REFERENCE_PREFIX);
        }
    }

    public static class MethodDecl extends Coordinates<J.MethodDecl> {

        protected MethodDecl(J.MethodDecl tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.METHOD_DECL_PREFIX);
        }

        public JavaCoordinates annotations() {
            return create(Space.Location.METHOD_DECL_PREFIX);
        }

        public JavaCoordinates lastParameter() {
            List<Statement> params = tree.getParams();
            return new JavaCoordinates(params.get(params.size() - 1), Space.Location.METHOD_DECL_ARGUMENT_SUFFIX);
        }

        /**
         * Intended for replacement semantics, where the method body specified will be entirely replaced by the code
         * generated via JavaTemplate
         *
         * @return method body replacement coordinates
         */
        public JavaCoordinates body() {
            return create(Space.Location.BLOCK_END);
        }
    }

    public static class MethodInvocation extends Coordinates<J.MethodInvocation> {

        protected MethodInvocation(J.MethodInvocation tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.METHOD_INVOCATION_PREFIX);
        }
    }

    public static class Modifier extends Coordinates<J.Modifier> {

        protected Modifier(J.Modifier tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.MODIFIER_PREFIX);
        }
    }

    public static class MultiCatch extends Coordinates<J.MultiCatch> {

        protected MultiCatch(J.MultiCatch tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.MULTI_CATCH_PREFIX);
        }
    }

    public static class NewArray extends Coordinates<J.NewArray> {

        protected NewArray(J.NewArray tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.NEW_ARRAY_PREFIX);
        }
    }

    public static class NewClass extends Coordinates<J.NewClass> {

        protected NewClass(J.NewClass tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.NEW_CLASS_PREFIX);
        }
    }

    public static class Package extends Coordinates<J.Package> {

        protected Package(J.Package tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.PACKAGE_PREFIX);
        }
    }

    public static class ParameterizedType extends Coordinates<J.ParameterizedType> {

        protected ParameterizedType(J.ParameterizedType tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.PARAMETERIZED_TYPE_PREFIX);
        }
    }

    public static class Parentheses<J2 extends J> extends Coordinates<J.Parentheses<J2>> {

        protected Parentheses(J.Parentheses<J2> tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.PARENTHESES_PREFIX);
        }
    }

    public static class Primitive extends Coordinates<J.Primitive> {

        protected Primitive(J.Primitive tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.PRIMITIVE_PREFIX);
        }
    }

    public static class Return extends Coordinates<J.Return> {

        protected Return(J.Return tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.RETURN_PREFIX);
        }
    }

    public static class Switch extends Coordinates<J.Switch> {

        protected Switch(J.Switch tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.SWITCH_PREFIX);
        }
    }

    public static class Synchronized extends Coordinates<J.Synchronized> {

        protected Synchronized(J.Synchronized tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.SYNCHRONIZED_PREFIX);
        }
    }

    public static class Ternary extends Coordinates<J.Ternary> {

        protected Ternary(J.Ternary tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.TERNARY_PREFIX);
        }
    }

    public static class Throw extends Coordinates<J.Throw> {

        protected Throw(J.Throw tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.THROW_PREFIX);
        }
    }

    public static class Try extends Coordinates<J.Try> {

        protected Try(J.Try tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.TRY_PREFIX);
        }

        public static class Catch extends Coordinates<J.Try.Catch> {

            protected Catch(J.Try.Catch catzch) {
                super(catzch);
            }

            @Override
            public JavaCoordinates before() {
                return create(Space.Location.CATCH_PREFIX);
            }
        }

        public static class Resource extends Coordinates<J.Try.Resource> {

            protected Resource(J.Try.Resource tree) {
                super(tree);
            }

            @Override
            public JavaCoordinates before() {
                return create(Space.Location.TRY_RESOURCE);
            }
        }
    }

    public static class TypeCast extends Coordinates<J.TypeCast> {

        protected TypeCast(J.TypeCast tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.TYPE_CAST_PREFIX);
        }
    }

    public static class TypeParameter extends Coordinates<J.TypeParameter> {

        protected TypeParameter(J.TypeParameter tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.TYPE_PARAMETERS_PREFIX);
        }

        public JavaCoordinates bounds() {
            return create(Space.Location.TYPE_BOUNDS);
        }
    }

    public static class Unary extends Coordinates<J.Unary> {

        protected Unary(J.Unary tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.UNARY_PREFIX);
        }
    }

    public static class VariableDecls extends Coordinates<J.VariableDecls> {

        protected VariableDecls(J.VariableDecls tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.MULTI_VARIABLE_PREFIX);
        }

        public static class NamedVar extends Coordinates<J.VariableDecls.NamedVar> {

            protected NamedVar(J.VariableDecls.NamedVar tree) {
                super(tree);
            }

            @Override
            public JavaCoordinates before() {
                return create(Space.Location.VARIABLE_PREFIX);
            }
        }
    }

    public static class WhileLoop extends Coordinates<J.WhileLoop> {

        protected WhileLoop(J.WhileLoop tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.WHILE_PREFIX);
        }
    }

    public static class Wildcard extends Coordinates<J.Wildcard> {

        protected Wildcard(J.Wildcard tree) {
            super(tree);
        }

        @Override
        public JavaCoordinates before() {
            return create(Space.Location.WILDCARD_PREFIX);
        }
    }
}
