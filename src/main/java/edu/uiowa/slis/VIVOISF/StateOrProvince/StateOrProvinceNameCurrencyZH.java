package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyZHIterator theStateOrProvince = (StateOrProvinceNameCurrencyZHIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyZHIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

