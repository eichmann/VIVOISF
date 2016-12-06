package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityARIterator theStateOrProvince = (StateOrProvinceNationalityARIterator)findAncestorWithClass(this, StateOrProvinceNationalityARIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

