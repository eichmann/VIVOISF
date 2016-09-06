package edu.uiowa.slis.VIVOISF.Gender;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GenderLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GenderLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GenderLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			if (!theGender.commitNeeded) {
				pageContext.getOut().print(theGender.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Gender for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			return theGender.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Gender for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			theGender.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Gender for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for label tag ");
		}
	}
}

