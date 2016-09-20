package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeRelatedInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeRelatedInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeRelatedInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeRelatedInverseIterator theThesisDegreeRelatedInverseIterator = (ThesisDegreeRelatedInverseIterator)findAncestorWithClass(this, ThesisDegreeRelatedInverseIterator.class);
			pageContext.getOut().print(theThesisDegreeRelatedInverseIterator.getRelatedInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for related tag ");
		}
		return SKIP_BODY;
	}
}

