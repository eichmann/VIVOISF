package edu.uiowa.slis.VIVOISF.Project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProjectBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProjectBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ProjectBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProjectBFO_0000055Iterator theProjectBFO_0000055Iterator = (ProjectBFO_0000055Iterator)findAncestorWithClass(this, ProjectBFO_0000055Iterator.class);
			pageContext.getOut().print(theProjectBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Project for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

