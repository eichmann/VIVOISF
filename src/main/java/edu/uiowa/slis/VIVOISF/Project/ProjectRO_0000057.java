package edu.uiowa.slis.VIVOISF.Project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProjectRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProjectRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProjectRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProjectRO_0000057Iterator theProjectRO_0000057Iterator = (ProjectRO_0000057Iterator)findAncestorWithClass(this, ProjectRO_0000057Iterator.class);
			pageContext.getOut().print(theProjectRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Project for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

