package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyESIterator thespecial_group = (special_groupNameCurrencyESIterator)findAncestorWithClass(this, special_groupNameCurrencyESIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

