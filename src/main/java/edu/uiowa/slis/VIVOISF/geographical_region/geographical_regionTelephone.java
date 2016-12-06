package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionTelephoneIterator thegeographical_region = (geographical_regionTelephoneIterator)findAncestorWithClass(this, geographical_regionTelephoneIterator.class);
			pageContext.getOut().print(thegeographical_region.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for telephone tag ");
		}
		return SKIP_BODY;
	}
}

