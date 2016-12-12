package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			if (!theSpecial_group.commitNeeded) {
				pageContext.getOut().print(theSpecial_group.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			return theSpecial_group.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Special_group theSpecial_group = (Special_group)findAncestorWithClass(this, Special_group.class);
			theSpecial_group.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for label tag ");
		}
	}
}

