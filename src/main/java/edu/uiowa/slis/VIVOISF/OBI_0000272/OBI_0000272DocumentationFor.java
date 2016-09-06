package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272DocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272DocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272DocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272DocumentationForIterator theOBI_0000272DocumentationForIterator = (OBI_0000272DocumentationForIterator)findAncestorWithClass(this, OBI_0000272DocumentationForIterator.class);
			pageContext.getOut().print(theOBI_0000272DocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

