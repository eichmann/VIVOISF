package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumTranslatorOfIterator theConsortiumTranslatorOfIterator = (ConsortiumTranslatorOfIterator)findAncestorWithClass(this, ConsortiumTranslatorOfIterator.class);
			pageContext.getOut().print(theConsortiumTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

