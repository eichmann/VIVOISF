package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationProducerIterator theLegislationProducerIterator = (LegislationProducerIterator)findAncestorWithClass(this, LegislationProducerIterator.class);
			pageContext.getOut().print(theLegislationProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for producer tag ");
		}
		return SKIP_BODY;
	}
}

