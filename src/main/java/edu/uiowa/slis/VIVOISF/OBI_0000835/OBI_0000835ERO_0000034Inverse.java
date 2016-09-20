package edu.uiowa.slis.VIVOISF.OBI_0000835;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000835ERO_0000034Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000835ERO_0000034Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000835ERO_0000034Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000835ERO_0000034InverseIterator theOBI_0000835ERO_0000034InverseIterator = (OBI_0000835ERO_0000034InverseIterator)findAncestorWithClass(this, OBI_0000835ERO_0000034InverseIterator.class);
			pageContext.getOut().print(theOBI_0000835ERO_0000034InverseIterator.getERO_0000034Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000835 for ERO_0000034 tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000835 for ERO_0000034 tag ");
		}
		return SKIP_BODY;
	}
}

