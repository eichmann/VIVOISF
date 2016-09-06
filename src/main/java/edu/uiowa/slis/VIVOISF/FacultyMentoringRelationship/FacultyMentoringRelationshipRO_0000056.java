package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMentoringRelationshipRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationshipRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationshipRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMentoringRelationshipRO_0000056Iterator theFacultyMentoringRelationshipRO_0000056Iterator = (FacultyMentoringRelationshipRO_0000056Iterator)findAncestorWithClass(this, FacultyMentoringRelationshipRO_0000056Iterator.class);
			pageContext.getOut().print(theFacultyMentoringRelationshipRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

