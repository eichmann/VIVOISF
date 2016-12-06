package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityFRIterator theStateOrProvince = (StateOrProvinceNationalityFRIterator)findAncestorWithClass(this, StateOrProvinceNationalityFRIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

