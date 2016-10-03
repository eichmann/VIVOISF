package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamEditorInverseIterator theTeamEditorInverseIterator = (TeamEditorInverseIterator)findAncestorWithClass(this, TeamEditorInverseIterator.class);
			pageContext.getOut().print(theTeamEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for editor tag ");
		}
		return SKIP_BODY;
	}
}

