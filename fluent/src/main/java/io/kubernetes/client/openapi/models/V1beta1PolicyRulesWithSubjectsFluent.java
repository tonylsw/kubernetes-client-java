/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public interface V1beta1PolicyRulesWithSubjectsFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToNonResourceRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule item);

  public A setToNonResourceRules(
      java.lang.Integer index,
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule item);

  public A addToNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items);

  public A addAllToNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule> items);

  public A removeFromNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items);

  public A removeAllFromNonResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule> items);

  public A removeMatchingFromNonResourceRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule>
      getNonResourceRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule>
      buildNonResourceRules();

  public io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule buildNonResourceRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule
      buildFirstNonResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule
      buildLastNonResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule
      buildMatchingNonResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleBuilder>
              predicate);

  public java.lang.Boolean hasMatchingNonResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleBuilder>
          predicate);

  public A withNonResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule>
          nonResourceRules);

  public A withNonResourceRules(
      io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... nonResourceRules);

  public java.lang.Boolean hasNonResourceRules();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      addNewNonResourceRuleLike(
          io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      setNewNonResourceRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editNonResourceRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editFirstNonResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editLastNonResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .NonResourceRulesNested<
          A>
      editMatchingNonResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleBuilder>
              predicate);

  public A addToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule item);

  public A setToResourceRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule item);

  public A addToResourceRules(
      io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items);

  public A addAllToResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule> items);

  public A removeFromResourceRules(
      io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items);

  public A removeAllFromResourceRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule> items);

  public A removeMatchingFromResourceRules(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule>
      getResourceRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule>
      buildResourceRules();

  public io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule buildResourceRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule buildFirstResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule buildLastResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule buildMatchingResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleBuilder>
          predicate);

  public java.lang.Boolean hasMatchingResourceRule(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleBuilder>
          predicate);

  public A withResourceRules(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule> resourceRules);

  public A withResourceRules(
      io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... resourceRules);

  public java.lang.Boolean hasResourceRules();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      addNewResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      setNewResourceRuleLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editResourceRule(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editFirstResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editLastResourceRule();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
              .ResourceRulesNested<
          A>
      editMatchingResourceRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleBuilder>
              predicate);

  public A addToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1Subject item);

  public A setToSubjects(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1Subject item);

  public A addToSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items);

  public A addAllToSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1Subject> items);

  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items);

  public A removeAllFromSubjects(
      java.util.Collection<io.kubernetes.client.openapi.models.V1beta1Subject> items);

  public A removeMatchingFromSubjects(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1SubjectBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildSubjects instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1Subject> getSubjects();

  public java.util.List<io.kubernetes.client.openapi.models.V1beta1Subject> buildSubjects();

  public io.kubernetes.client.openapi.models.V1beta1Subject buildSubject(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1Subject buildFirstSubject();

  public io.kubernetes.client.openapi.models.V1beta1Subject buildLastSubject();

  public io.kubernetes.client.openapi.models.V1beta1Subject buildMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1SubjectBuilder>
          predicate);

  public java.lang.Boolean hasMatchingSubject(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1SubjectBuilder>
          predicate);

  public A withSubjects(
      java.util.List<io.kubernetes.client.openapi.models.V1beta1Subject> subjects);

  public A withSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... subjects);

  public java.lang.Boolean hasSubjects();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      addNewSubject();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      addNewSubjectLike(io.kubernetes.client.openapi.models.V1beta1Subject item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      setNewSubjectLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1beta1Subject item);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editSubject(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editFirstSubject();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editLastSubject();

  public io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A>
      editMatchingSubject(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1SubjectBuilder>
              predicate);

  public interface NonResourceRulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRuleFluent<
              io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
                      .NonResourceRulesNested<
                  N>> {
    public N and();

    public N endNonResourceRule();
  }

  public interface ResourceRulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRuleFluent<
              io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
                      .ResourceRulesNested<
                  N>> {
    public N and();

    public N endResourceRule();
  }

  public interface SubjectsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1SubjectFluent<
              io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjectsFluent
                      .SubjectsNested<
                  N>> {
    public N and();

    public N endSubject();
  }
}
