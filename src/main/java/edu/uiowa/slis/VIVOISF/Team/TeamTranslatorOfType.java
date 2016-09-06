package edu.uiowa.slis.VIVOISF.Team;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TeamTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TeamTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(TeamTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TeamTranslatorOfIterator theTeamTranslatorOfIterator = (TeamTranslatorOfIterator)findAncestorWithClass(this, TeamTranslatorOfIterator.class);
			pageContext.getOut().print(theTeamTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Team for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Team for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

