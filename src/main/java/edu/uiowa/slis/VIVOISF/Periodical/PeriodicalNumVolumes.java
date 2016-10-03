package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNumVolumesIterator thePeriodical = (PeriodicalNumVolumesIterator)findAncestorWithClass(this, PeriodicalNumVolumesIterator.class);
			pageContext.getOut().print(thePeriodical.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

