package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hideFromDisplay tag ");
		}
	}
}

