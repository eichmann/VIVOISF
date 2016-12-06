package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityRUIterator theStateOrProvince = (StateOrProvinceNationalityRUIterator)findAncestorWithClass(this, StateOrProvinceNationalityRUIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

