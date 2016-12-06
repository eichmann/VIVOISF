package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindGeographicFocusIterator theKindGeographicFocusIterator = (KindGeographicFocusIterator)findAncestorWithClass(this, KindGeographicFocusIterator.class);
			pageContext.getOut().print(theKindGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

