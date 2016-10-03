package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalEditorIterator thePeriodicalEditorIterator = (PeriodicalEditorIterator)findAncestorWithClass(this, PeriodicalEditorIterator.class);
			pageContext.getOut().print(thePeriodicalEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for editor tag ");
		}
		return SKIP_BODY;
	}
}

