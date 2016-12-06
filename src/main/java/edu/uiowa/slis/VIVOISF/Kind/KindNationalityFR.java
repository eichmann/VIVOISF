package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityFRIterator theKind = (KindNationalityFRIterator)findAncestorWithClass(this, KindNationalityFRIterator.class);
			pageContext.getOut().print(theKind.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

