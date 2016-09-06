package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingGeographicFocusOfIterator thenon_self_governingGeographicFocusOfIterator = (non_self_governingGeographicFocusOfIterator)findAncestorWithClass(this, non_self_governingGeographicFocusOfIterator.class);
			pageContext.getOut().print(thenon_self_governingGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

