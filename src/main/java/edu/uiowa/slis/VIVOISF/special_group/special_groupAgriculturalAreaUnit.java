package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupAgriculturalAreaUnitIterator thespecial_group = (special_groupAgriculturalAreaUnitIterator)findAncestorWithClass(this, special_groupAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thespecial_group.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

