package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			if (!thespecial_group.commitNeeded) {
				pageContext.getOut().print(thespecial_group.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			return thespecial_group.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			thespecial_group.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for label tag ");
		}
	}
}

