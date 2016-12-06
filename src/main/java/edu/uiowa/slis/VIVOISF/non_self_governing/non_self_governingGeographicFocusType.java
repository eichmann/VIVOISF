package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingGeographicFocusIterator thenon_self_governingGeographicFocusIterator = (non_self_governingGeographicFocusIterator)findAncestorWithClass(this, non_self_governingGeographicFocusIterator.class);
			pageContext.getOut().print(thenon_self_governingGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

