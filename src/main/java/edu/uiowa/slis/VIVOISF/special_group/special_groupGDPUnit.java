package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupGDPUnitIterator thespecial_group = (special_groupGDPUnitIterator)findAncestorWithClass(this, special_groupGDPUnitIterator.class);
			pageContext.getOut().print(thespecial_group.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

