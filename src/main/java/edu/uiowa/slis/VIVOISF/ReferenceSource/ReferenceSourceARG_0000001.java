package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceARG_0000001Iterator theReferenceSource = (ReferenceSourceARG_0000001Iterator)findAncestorWithClass(this, ReferenceSourceARG_0000001Iterator.class);
			pageContext.getOut().print(theReferenceSource.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

