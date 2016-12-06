package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyITIterator thespecial_group = (special_groupNameCurrencyITIterator)findAncestorWithClass(this, special_groupNameCurrencyITIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

