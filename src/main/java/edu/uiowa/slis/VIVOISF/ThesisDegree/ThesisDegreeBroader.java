package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeBroaderIterator theThesisDegreeBroaderIterator = (ThesisDegreeBroaderIterator)findAncestorWithClass(this, ThesisDegreeBroaderIterator.class);
			pageContext.getOut().print(theThesisDegreeBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for broader tag ");
		}
		return SKIP_BODY;
	}
}

