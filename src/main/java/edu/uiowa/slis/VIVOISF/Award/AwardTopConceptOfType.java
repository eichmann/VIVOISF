package edu.uiowa.slis.VIVOISF.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardTopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AwardTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardTopConceptOfIterator theAwardTopConceptOfIterator = (AwardTopConceptOfIterator)findAncestorWithClass(this, AwardTopConceptOfIterator.class);
			pageContext.getOut().print(theAwardTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

