package edu.uiowa.slis.VIVOISF.Spouse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpouseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpouseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SpouseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			if (!theSpouse.commitNeeded) {
				pageContext.getOut().print(theSpouse.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Spouse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			return theSpouse.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Spouse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			theSpouse.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Spouse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for label tag ");
		}
	}
}

