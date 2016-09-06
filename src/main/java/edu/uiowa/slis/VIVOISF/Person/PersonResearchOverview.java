package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for researchOverview tag ");
		}
	}
}

