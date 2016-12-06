package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupLandAreaUnitIterator thespecial_group = (special_groupLandAreaUnitIterator)findAncestorWithClass(this, special_groupLandAreaUnitIterator.class);
			pageContext.getOut().print(thespecial_group.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

