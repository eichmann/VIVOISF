package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSourceIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSourceIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSourceIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingSourceIdentifierIterator theself_governing = (self_governingSourceIdentifierIterator)findAncestorWithClass(this, self_governingSourceIdentifierIterator.class);
			pageContext.getOut().print(theself_governing.getSourceIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for sourceIdentifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for sourceIdentifier tag ");
		}
		return SKIP_BODY;
	}
}

