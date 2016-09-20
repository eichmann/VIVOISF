package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeDegreeCandidacyInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeDegreeCandidacyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeDegreeCandidacyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeDegreeCandidacyInverseIterator theThesisDegreeDegreeCandidacyInverseIterator = (ThesisDegreeDegreeCandidacyInverseIterator)findAncestorWithClass(this, ThesisDegreeDegreeCandidacyInverseIterator.class);
			pageContext.getOut().print(theThesisDegreeDegreeCandidacyInverseIterator.getDegreeCandidacyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for degreeCandidacy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for degreeCandidacy tag ");
		}
		return SKIP_BODY;
	}
}

