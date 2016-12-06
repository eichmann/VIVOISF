package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001HasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001HasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001HasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001HasSubjectAreaIterator theBFO_0000001HasSubjectAreaIterator = (BFO_0000001HasSubjectAreaIterator)findAncestorWithClass(this, BFO_0000001HasSubjectAreaIterator.class);
			pageContext.getOut().print(theBFO_0000001HasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

