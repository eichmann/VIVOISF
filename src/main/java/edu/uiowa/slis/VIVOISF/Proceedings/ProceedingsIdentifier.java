package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIdentifierIterator theProceedings = (ProceedingsIdentifierIterator)findAncestorWithClass(this, ProceedingsIdentifierIterator.class);
			pageContext.getOut().print(theProceedings.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for identifier tag ");
		}
		return SKIP_BODY;
	}
}

