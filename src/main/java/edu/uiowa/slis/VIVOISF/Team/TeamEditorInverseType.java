package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamEditorInverseIterator theTeamEditorInverseIterator = (TeamEditorInverseIterator)findAncestorWithClass(this, TeamEditorInverseIterator.class);
			pageContext.getOut().print(theTeamEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for editor tag ");
		}
		return SKIP_BODY;
	}
}

