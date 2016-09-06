package edu.uiowa.slis.VIVOISF.FacultyMentoringRelationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMentoringRelationshipRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMentoringRelationshipRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMentoringRelationshipRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMentoringRelationshipRO_0000052Iterator theFacultyMentoringRelationshipRO_0000052Iterator = (FacultyMentoringRelationshipRO_0000052Iterator)findAncestorWithClass(this, FacultyMentoringRelationshipRO_0000052Iterator.class);
			pageContext.getOut().print(theFacultyMentoringRelationshipRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMentoringRelationship for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMentoringRelationship for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

