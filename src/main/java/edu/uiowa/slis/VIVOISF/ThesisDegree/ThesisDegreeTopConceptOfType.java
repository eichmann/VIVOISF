package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeTopConceptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeTopConceptOfIterator theThesisDegreeTopConceptOfIterator = (ThesisDegreeTopConceptOfIterator)findAncestorWithClass(this, ThesisDegreeTopConceptOfIterator.class);
			pageContext.getOut().print(theThesisDegreeTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

