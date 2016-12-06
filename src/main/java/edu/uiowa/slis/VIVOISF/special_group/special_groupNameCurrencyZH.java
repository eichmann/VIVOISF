package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupNameCurrencyZHIterator thespecial_group = (special_groupNameCurrencyZHIterator)findAncestorWithClass(this, special_groupNameCurrencyZHIterator.class);
			pageContext.getOut().print(thespecial_group.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

