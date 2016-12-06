package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNationalityITIterator thespecial_group = (special_groupNationalityITIterator)findAncestorWithClass(this, special_groupNationalityITIterator.class);
			pageContext.getOut().print(thespecial_group.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

