package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumTranslatorOfIterator theConsortiumTranslatorOfIterator = (ConsortiumTranslatorOfIterator)findAncestorWithClass(this, ConsortiumTranslatorOfIterator.class);
			pageContext.getOut().print(theConsortiumTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

