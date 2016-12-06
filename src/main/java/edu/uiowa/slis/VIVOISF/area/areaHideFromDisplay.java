package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			if (!thearea.commitNeeded) {
				pageContext.getOut().print(thearea.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing area for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			return thearea.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing area for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			area thearea = (area)findAncestorWithClass(this, area.class);
			thearea.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing area for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hideFromDisplay tag ");
		}
	}
}

