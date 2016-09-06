package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeNarrowerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeNarrowerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeNarrowerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeNarrowerIterator theAcademicDegreeNarrowerIterator = (AcademicDegreeNarrowerIterator)findAncestorWithClass(this, AcademicDegreeNarrowerIterator.class);
			pageContext.getOut().print(theAcademicDegreeNarrowerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for narrower tag ");
		}
		return SKIP_BODY;
	}
}

