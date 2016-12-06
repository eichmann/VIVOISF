package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			if (!thespecial_group.commitNeeded) {
				pageContext.getOut().print(thespecial_group.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			return thespecial_group.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing special_group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			special_group thespecial_group = (special_group)findAncestorWithClass(this, special_group.class);
			thespecial_group.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hideFromDisplay tag ");
		}
	}
}

