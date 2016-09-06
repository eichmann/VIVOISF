package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceTheAbstractIterator theReferenceSource = (ReferenceSourceTheAbstractIterator)findAncestorWithClass(this, ReferenceSourceTheAbstractIterator.class);
			pageContext.getOut().print(theReferenceSource.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

