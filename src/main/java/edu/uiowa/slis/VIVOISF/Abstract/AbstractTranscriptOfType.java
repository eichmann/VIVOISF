package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractTranscriptOfIterator theAbstractTranscriptOfIterator = (AbstractTranscriptOfIterator)findAncestorWithClass(this, AbstractTranscriptOfIterator.class);
			pageContext.getOut().print(theAbstractTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

